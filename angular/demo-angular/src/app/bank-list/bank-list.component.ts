import { Component } from '@angular/core';
import { Bank, BankService } from './bank.service';

@Component({
  selector: 'app-bank-list',
  templateUrl: './bank-list.component.html',
  styleUrls: ['./bank-list.component.scss']
})
export class BankListComponent {
  banks: Bank[] = [];
  constructor(private bankService: BankService) {}

  ngOnInit(): void {
    this.bankService.getBanks().subscribe((data) => {
      this.banks = data;
    });
    
  }

}
