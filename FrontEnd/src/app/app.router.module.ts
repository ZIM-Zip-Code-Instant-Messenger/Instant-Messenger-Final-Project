import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { CreateAccountComponent } from './components/create-account/create-account.component';
import { MessengerMainComponent } from './components/messenger-main/messenger-main.component';
const routes: Routes = [
    {path: '.', component: LoginComponent, pathMatch: 'full'}, //pathMatch means that the path has to be exactly this variable.
    {path: 'create-account', component: CreateAccountComponent}, //notice here no pathMatch full. so "signup/insert-anything" would still route back to sign up
    {path: 'messenger-main', component: MessengerMainComponent},
    {path: '**', redirectTo : '.'}
    

];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)  // passing in our routes variable so angular can iterate over the array
  ],
exports: [RouterModule]
})
export class RoutingModule {} 