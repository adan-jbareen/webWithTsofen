import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-student',
  templateUrl: './add-student.component.html',
  styleUrls: ['./add-student.component.sass']
})
export class AddStudentComponent implements OnInit {
  breadscrums = [
    {
      title: 'Add student',
      items: ['Student'],
      active: 'Add student',
    },
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
