import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { StudentService } from './student.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent {
  success = false;
  constructor( public fb: FormBuilder, private studentService: StudentService) {}
  studentForm = this.fb.group({
    id: [null],
    name: [''],
    marks: [0]
  });

  onSave() : void {
      let id = this.studentForm?.get('id')?.value || 0;
      let name = this.studentForm?.get('name')?.value || '';
      let marks = this.studentForm?.get('marks')?.value || 0;
      this.studentService.saveStudent(id,name,marks).subscribe(() => {
        this.success = true;
      });
      console.log(this.studentForm);
  }
}

