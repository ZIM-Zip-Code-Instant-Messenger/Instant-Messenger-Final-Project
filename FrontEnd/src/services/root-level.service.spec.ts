import { TestBed } from '@angular/core/testing';

import { RootLevelService } from './root-level.service';

describe('RootLevelService', () => {
  let service: RootLevelService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RootLevelService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
