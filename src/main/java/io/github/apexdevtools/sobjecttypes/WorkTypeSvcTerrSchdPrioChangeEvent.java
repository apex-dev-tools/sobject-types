/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.eventbus.ChangeEventHeader;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class WorkTypeSvcTerrSchdPrioChangeEvent extends SObject {
	public static SObjectType$<WorkTypeSvcTerrSchdPrioChangeEvent> SObjectType;
	public static SObjectFields$<WorkTypeSvcTerrSchdPrioChangeEvent> Fields;

	public ChangeEventHeader ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentServiceTerritoryId;
	public ServiceTerritory ParentServiceTerritory;
	public Integer Priority;
	public String ReplayId;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public String UsageType;
	public Id WorkProcedureId;
	public WorkProcedure WorkProcedure;
	public Id WorkTypeId;
	public WorkType WorkType;

	public WorkTypeSvcTerrSchdPrioChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrioChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrioChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrioChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeSvcTerrSchdPrioChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
