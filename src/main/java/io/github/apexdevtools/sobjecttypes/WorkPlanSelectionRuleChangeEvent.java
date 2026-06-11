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
public class WorkPlanSelectionRuleChangeEvent extends SObject {
	public static SObjectType$<WorkPlanSelectionRuleChangeEvent> SObjectType;
	public static SObjectFields$<WorkPlanSelectionRuleChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public Id OwnerId;
	public User Owner;
	public Id Product2Id;
	public Product2 Product2;
	public String ReplayId;
	public Id ServiceContractId;
	public ServiceContract ServiceContract;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String WorkPlanSelectionRuleNumber;
	public Id WorkPlanTemplateId;
	public WorkPlanTemplate WorkPlanTemplate;
	public Id WorkTypeId;
	public WorkType WorkType;

	public WorkPlanSelectionRuleChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanSelectionRuleChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanSelectionRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanSelectionRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkPlanSelectionRuleChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
