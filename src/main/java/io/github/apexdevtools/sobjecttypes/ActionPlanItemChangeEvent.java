/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActionPlanItemChangeEvent extends SObject {
	public static SObjectType$<ActionPlanItemChangeEvent> SObjectType;
	public static SObjectFields$<ActionPlanItemChangeEvent> Fields;

	public Id ActionPlanId;
	public ActionPlan ActionPlan;
	public Id ActionPlanTemplateItemId;
	public ActionPlanTemplateItem ActionPlanTemplateItem;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DependencyStatus;
	public Integer DisplayOrder;
	public Id Id;
	public Boolean IsRequired;
	public String ItemEntityType;
	public Id ItemId;
	public SObject Item;
	public String ItemState;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public String ReplayId;

	public ActionPlanItemChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanItemChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActionPlanItemChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
