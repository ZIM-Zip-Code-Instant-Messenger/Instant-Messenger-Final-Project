import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { MessengerMainComponent } from './components/messenger-main/messenger-main.component';

const routes: Routes = [
  { path: '', component: LoginComponent, pathMatch: 'full' },
  { path: 'messenger-main', component: MessengerMainComponent },
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)  // passing in our routes variable so angular can iterate over the array
  ],
exports: [RouterModule]
})
export class RoutingModule {} 