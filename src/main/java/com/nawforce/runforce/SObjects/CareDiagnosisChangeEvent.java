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
public class CareDiagnosisChangeEvent extends SObject {
	public static SObjectType$<CareDiagnosisChangeEvent> SObjectType;
	public static SObjectFields$<CareDiagnosisChangeEvent> Fields;

	public Id CareRequestCaseId;
	public Case CareRequestCase;
	public Id CareRequestId;
	public CareRequest CareRequest;
	public Object ChangeEventHeader;
	public String CodeDescription;
	public String CodeType;
	public String CodeTypeIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id DiagnosisCodeId;
	public HealthCareDiagnosis DiagnosisCode;
	public Id DiagnosisCodeSetId;
	public SObject DiagnosisCodeSet;
	public String DischargeCode;
	public String DischargeCodeDescription;
	public String DischargeCodeType;
	public String DischargeCodeTypeIdentifier;
	public Id DischargeDiagnosisCodeId;
	public HealthCareDiagnosis DischargeDiagnosisCode;
	public Date DischargeDiagnosisEffectiveDate;
	public Date DischargeDiagnosisEndDate;
	public Id DischrgeDiagnosisCodeSetId;
	public SObject DischrgeDiagnosisCodeSet;
	public String Division;
	public Date EffectiveDate;
	public Date EndDate;
	public Id HealthConditionId;
	public HealthCondition HealthCondition;
	public Id Id;
	public Boolean IsDischargeDiagnosisPrimary;
	public Boolean IsModifiedDiagnosisPrimary;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ModifiedCode;
	public String ModifiedCodeDescription;
	public String ModifiedCodeType;
	public String ModifiedCodeTypeIdentifier;
	public Id ModifiedDiagnosisCodeId;
	public HealthCareDiagnosis ModifiedDiagnosisCode;
	public Id ModifiedDiagnosisCodeSetId;
	public SObject ModifiedDiagnosisCodeSet;
	public Date ModifiedEffectiveDate;
	public Date ModifiedEndDate;
	public String Name;
	public String PresentOnAdmission;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Datetime SourceSystemModified;

	public CareDiagnosisChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosisChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
