/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
