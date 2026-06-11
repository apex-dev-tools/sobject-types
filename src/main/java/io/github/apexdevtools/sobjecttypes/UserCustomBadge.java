/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class UserCustomBadge extends SObject {
	public static SObjectType$<UserCustomBadge> SObjectType;
	public static SObjectFields$<UserCustomBadge> Fields;

	public String BadgeType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomText;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id ParentId;
	public Name Parent;
	public Datetime SystemModstamp;

	public UserCustomBadgeLocalization[] Localization;

	public UserCustomBadge clone$() {throw new java.lang.UnsupportedOperationException();}
	public UserCustomBadge clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public UserCustomBadge clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public UserCustomBadge clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public UserCustomBadge clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
