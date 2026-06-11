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
public class CleanEnergyProjectChangeEvent extends SObject {
	public static SObjectType$<CleanEnergyProjectChangeEvent> SObjectType;
	public static SObjectFields$<CleanEnergyProjectChangeEvent> Fields;

	public Object ChangeEventHeader;
	public String CleanEnergyType;
	public String Country;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DeveloperAccountId;
	public Supplier DeveloperAccount;
	public Id ElectrEmissionsFactorsId;
	public ElectricityEmssnFctrSet ElectrEmissionsFactors;
	public String ExternalIdentifier;
	public String FundedBy;
	public String GridSubregion;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ProjectUrl;
	public String Region;
	public String ReplayId;

	public CleanEnergyProjectChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CleanEnergyProjectChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CleanEnergyProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CleanEnergyProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CleanEnergyProjectChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
