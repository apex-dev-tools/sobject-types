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
public class GroupCensusMemberPlanChangeEvent extends SObject {
	public static SObjectType$<GroupCensusMemberPlanChangeEvent> SObjectType;
	public static SObjectFields$<GroupCensusMemberPlanChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id ContractGroupPlanId;
	public ContractGroupPlan ContractGroupPlan;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String EnrollmentStatus;
	public String EventAction;
	public Id GroupCensusMemberId;
	public GroupCensusMember GroupCensusMember;
	public Id Id;
	public Boolean IsOptional;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String OverrideTypeStatus;
	public Id OwnerId;
	public User Owner;
	public Id ProductCategoryId;
	public ProductCategory ProductCategory;
	public String ReplayId;
	public Decimal StandardFeeAmount;
	public Decimal StandardPremiumAmount;
	public Decimal StandardTaxAmount;

	public GroupCensusMemberPlanChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberPlanChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GroupCensusMemberPlanChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
