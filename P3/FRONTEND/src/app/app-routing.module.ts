import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContractorProfileComponent } from './component/contractor-profile/contractor-profile.component';
import { CustomerProfileComponent } from './component/customer-profile/customer-profile.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { RegisterCustomerComponent } from './component/register-customer/register-customer.component';
import { RegisterComponent } from './component/register/register.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'component/dashboard', component: DashboardComponent },
  {path: 'component/register', component:RegisterComponent},
  {path: 'component/register-customer', component:RegisterCustomerComponent},
  {path: 'component/contractor-profile', component: ContractorProfileComponent},
  {path: 'component/customer-profile', component: CustomerProfileComponent},


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
