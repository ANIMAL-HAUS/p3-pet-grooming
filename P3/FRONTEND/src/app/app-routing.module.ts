import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { GroomingComponent } from './component/grooming/grooming.component';
import { RegisterCustomerComponent } from './component/register-customer/register-customer.component';
import { RegisterComponent } from './component/register/register.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'dashboard', component: DashboardComponent },
  {path: 'register', component: RegisterComponent},
  { path: 'register-customer', component: RegisterCustomerComponent},
  {path: 'grooming', component: GroomingComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
