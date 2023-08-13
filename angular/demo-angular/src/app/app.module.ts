import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from  '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { BankListComponent } from './bank-list/bank-list.component';
import { HomeComponent } from './home/home.component';
import { ReactiveFormsModule } from '@angular/forms';

const appRoutes: Routes = [

  { path: '', redirectTo: 'home' , pathMatch: 'full' }, // routs from that root to the landing route
  { path: 'home', component: HomeComponent}, // routs from that root to the landing route

  { path: 'users', component: UserListComponent },
  { path: 'banks', component: BankListComponent }// tab 1
]

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    BankListComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(appRoutes, { enableTracing: true }), // import routes
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
