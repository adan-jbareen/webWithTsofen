import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-student',
  templateUrl: './update-student.component.html',
  styleUrls: ['./update-student.component.sass']
})
export class UpdateStudentComponent implements OnInit {
  breadscrums = [
    {
      title: 'Update student',
      items: ['Student'],
      active: 'Update student',
    },
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
