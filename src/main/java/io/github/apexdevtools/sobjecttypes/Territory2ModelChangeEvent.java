/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class Territory2ModelChangeEvent extends SObject {
	public static SObjectType$<Territory2ModelChangeEvent> SObjectType;
	public static SObjectFields$<Territory2ModelChangeEvent> Fields;

	public Datetime ActivatedDate;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime DeactivatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsCloneSource;
	public Boolean IsOppUnassignmentDone;
	public Boolean IsSharingGroupDeleteDone;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastOppTerrAssignEndDate;
	public Datetime LastRunRulesEndDate;
	public String Name;
	public String ReplayId;
	public String State;

	public Territory2ModelChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public Territory2ModelChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ModelChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ModelChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Territory2ModelChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
