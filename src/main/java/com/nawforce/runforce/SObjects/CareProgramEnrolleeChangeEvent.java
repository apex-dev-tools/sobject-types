/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class CareProgramEnrolleeChangeEvent extends SObject {
	public static SObjectType$<CareProgramEnrolleeChangeEvent> SObjectType;
	public static SObjectFields$<CareProgramEnrolleeChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public String BenefitCoverageType;
	public Id CareProgramId;
	public CareProgram CareProgram;
	public Object ChangeEventHeader;
	public Id ClinicalServiceRequestId;
	public ClinicalServiceRequest ClinicalServiceRequest;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrolleeType;
	public Id EnrollmentLocationId;
	public ServiceTerritory EnrollmentLocation;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsPatientInLtrmCareFacility;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public String Name;
	public Datetime OptOutPeriodEndDateTime;
	public Datetime OptOutPeriodStartDateTime;
	public String OptOutReasonType;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public String Status;
	public Id UserId;
	public User User;

	public CareProgramEnrolleeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrolleeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrolleeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrolleeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareProgramEnrolleeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
