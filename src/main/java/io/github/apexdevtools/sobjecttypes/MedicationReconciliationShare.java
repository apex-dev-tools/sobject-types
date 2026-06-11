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
public class MedicationReconciliationShare extends SObject {
	public static SObjectType$<MedicationReconciliationShare> SObjectType;
	public static SObjectFields$<MedicationReconciliationShare> Fields;

	public String AccessLevel;
	public String Division;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public MedicationReconciliation Parent;
	public String RowCause;
	public Id UserOrGroupId;
	public Name UserOrGroup;

	public MedicationReconciliationShare clone$() {throw new java.lang.UnsupportedOperationException();}
	public MedicationReconciliationShare clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MedicationReconciliationShare clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MedicationReconciliationShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MedicationReconciliationShare clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
