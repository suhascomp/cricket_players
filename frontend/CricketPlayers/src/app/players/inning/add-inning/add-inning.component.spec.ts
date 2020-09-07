import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddInningComponent } from './add-inning.component';

describe('AddInningComponent', () => {
  let component: AddInningComponent;
  let fixture: ComponentFixture<AddInningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddInningComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddInningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
