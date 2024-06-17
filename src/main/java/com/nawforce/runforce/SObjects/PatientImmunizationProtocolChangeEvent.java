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
public class PatientImmunizationProtocolChangeEvent extends SObject {
	public static SObjectType$<PatientImmunizationProtocolChangeEvent> SObjectType;
	public static SObjectFields$<PatientImmunizationProtocolChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String CurrentDose;
	public String Division;
	public Id Id;
	public String ImmunizationRecommendation;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id PatientImmunizationId;
	public PatientImmunization PatientImmunization;
	public String RecommendedDoses;
	public String RecommendingAuthority;
	public String ReplayId;
	public Id TargetDisease1CodeId;
	public CodeSetBundle TargetDisease1Code;
	public Id TargetDisease2CodeId;
	public CodeSetBundle TargetDisease2Code;
	public Id TargetDisease3CodeId;
	public CodeSetBundle TargetDisease3Code;
	public Id TargetDisease4CodeId;
	public CodeSetBundle TargetDisease4Code;
	public Id TargetDisease5CodeId;
	public CodeSetBundle TargetDisease5Code;
	public Id TargetDisease6CodeId;
	public CodeSetBundle TargetDisease6Code;

	public PatientImmunizationProtocolChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocolChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocolChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocolChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PatientImmunizationProtocolChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
