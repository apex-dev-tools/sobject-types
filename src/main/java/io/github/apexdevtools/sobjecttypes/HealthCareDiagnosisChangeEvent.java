/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
