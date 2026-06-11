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
public class PercentileBsdCareFeeAgreementHistory extends SObject {
	public static SObjectType$<PercentileBsdCareFeeAgreementHistory> SObjectType;
	public static SObjectFields$<PercentileBsdCareFeeAgreementHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String Division;
	public String Field;
	public Id Id;
	public Boolean IsDeleted;
	public Object NewValue;
	public Object OldValue;
	public Id PercentileBsdCareFeeAgreementId;
	public PercentileBsdCareFeeAgreement PercentileBsdCareFeeAgreement;

	public PercentileBsdCareFeeAgreementHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PercentileBsdCareFeeAgreementHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
