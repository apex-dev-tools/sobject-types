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
public class WorkTypeStepLdTimeOvrideChangeEvent extends SObject {
	public static SObjectType$<WorkTypeStepLdTimeOvrideChangeEvent> SObjectType;
	public static SObjectFields$<WorkTypeStepLdTimeOvrideChangeEvent> Fields;

	public ChangeEventHeader ChangeEventHeader;
	public Id CountryId;
	public GeoCountry Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LeadTime;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Integer Priority;
	public Id RelatedWorkTypeServiceTerritoryId;
	public ServiceTerritory RelatedWorkTypeServiceTerritory;
	public String ReplayId;
	public Id ServiceTerritoryId;
	public ServiceTerritory ServiceTerritory;
	public Id WorkProcedureId;
	public WorkProcedure WorkProcedure;
	public Id WorkTypeId;
	public WorkType WorkType;
	public Id WorkTypeServiceTerritoryId;
	public ServiceTerritory WorkTypeServiceTerritory;
	public Id WorkTypeStepId;
	public WorkTypeStep WorkTypeStep;

	public WorkTypeStepLdTimeOvrideChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvrideChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeStepLdTimeOvrideChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
