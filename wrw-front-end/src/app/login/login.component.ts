import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserserviceService } from '../userservice.service';
import {
  AuthService,
  GoogleLoginProvider,
  SocialUser
} from 'angularx-social-login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public userName: any = '';
  public password: any = '';

  private user: SocialUser;
  private loggedIn: boolean;

  constructor(
    private userService: UserserviceService,
    private router: Router,
    private authService: AuthService
  ) {}

  ngOnInit() {}

  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID).then(user => {
      // console.log(user);
      this.user = user;
      this.loggedIn = user != null;
      if (this.loggedIn) {
        this.router.navigate(['homepage']);
      }
    });
  }

  signOut(): void {
    this.authService.signOut();
  }
  login() {
    this.userService.login(this.userName, this.password).subscribe(response => {
      // console.log(response);
      if (response) {
        // console.log(response);
        this.router.navigate(['homepage']);
      }
    });
  }
  saveUser() {
    // console.log(this.userName, this.password);
    this.userService.saveUser(this.userName, this.password).subscribe(
      response => {
        // console.log(response);
        if (response) {
          this.router.navigate(['homepage']);
        }
      },
      err => {
        console.log(err);
      }
    );
  }
}
