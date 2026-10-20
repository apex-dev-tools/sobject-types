/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class GrpCensusMbrPlanSurchargeChangeEvent extends SObject {
	public static SObjectType$<GrpCensusMbrPlanSurchargeChangeEvent> SObjectType;
	public static SObjectFields$<GrpCensusMbrPlanSurchargeChangeEvent> Fields;

	public ChangeEventHeader ChangeEventHeader;
	public String ConstraintModelDeveloperName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id GroupCensusMemberPlanId;
	public GroupCensusMemberPlan GroupCensusMemberPlan;
	public Id Id;
	public Boolean IsAssociatedWithRootPlan;
	public Boolean IsProrationAllowed;
	public Boolean IsRefundAllowed;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;
	public String SourceSystem;
	public String SourceSystemIdentifier;
	public Decimal StandardAmount;
	public String Type;

	public GrpCensusMbrPlanSurchargeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusMbrPlanSurchargeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusMbrPlanSurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusMbrPlanSurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public GrpCensusMbrPlanSurchargeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
