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
public class HealthCareDiagnosisChangeEvent extends SObject {
	public static SObjectType$<HealthCareDiagnosisChangeEvent> SObjectType;
	public static SObjectFields$<HealthCareDiagnosisChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
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
	public Boolean IsHospitalAcquiredCondition;
	public Boolean IsMajorComplicationOrComorbidity;
	public Boolean IsPresentOnAdmissionExempt;
	public Boolean IsPrimaryDiagnosis;
	public Boolean IsUnacceptablePrincipalDxIpAdmit;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;

	public HealthCareDiagnosisChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosisChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public HealthCareDiagnosisChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
