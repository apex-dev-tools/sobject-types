/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ReputationLevel extends SObject {
	public static SObjectType$<ReputationLevel> SObjectType;
	public static SObjectFields$<ReputationLevel> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public String Label;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LevelNumber;
	public Id ParentId;
	public Name Parent;
	public Datetime SystemModstamp;
	public Decimal Threshold;

	public CustomBrand[] CustomBrands;
	public ReputationLevelLocalization[] Localization;

	public ReputationLevel clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReputationLevel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReputationLevel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReputationLevel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReputationLevel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
