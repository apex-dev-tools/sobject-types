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
public class HealthCareDiagnosis extends SObject {
	public static SObjectType$<HealthCareDiagnosis> SObjectType;
	public static SObjectFields$<HealthCareDiagnosis> Fields;

	public String Category;
	public String Code;
	public String CodeDescription;
	public String CodeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Date EffectiveDate;
	public Date EndDate;
	public String Gender;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsComplicationOrComorbidity;
	public Boolean IsDeleted;
	public Boolean IsHospitalAcquiredCondition;
	public Boolean IsMajorComplicationOrComorbidity;
	public Boolean IsPresentOnAdmissionExempt;
	public Boolean IsPrimaryDiagnosis;
	public Boolean IsUnacceptablePrincipalDxIpAdmit;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Datetime SystemModstamp;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CareBarrierType[] CareBarrierHealthCareDignosis;
	public CareDiagnosis[] DiagnosisCodes;
	public CareDiagnosis[] DischargeDiagnosisCodes;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public HealthCareDiagnosisHistory[] Histories;
	public CareDiagnosis[] ModifiedDiagnosisCodes;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public HealthCareDiagnosisShare[] Shares;

	public HealthCareDiagnosis clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosis clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosis clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
