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
public class SiteMarketingDataExtensionMapping extends SObject {
	public static SObjectType$<SiteMarketingDataExtensionMapping> SObjectType;
	public static SObjectFields$<SiteMarketingDataExtensionMapping> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MarketingDataExtension;
	public String MarketingDataExtensionFieldsSchema;
	public String MarketingMemberIdentification;
	public String MarketingTenantSpecificAuthEndpoint;
	public String MarketingTenantSpecificRestEndpoint;
	public String Name;
	public Id SiteId;
	public Site Site;
	public Datetime SystemModstamp;

	public SiteMarketingDataExtensionMapping clone$() {throw new java.lang.UnsupportedOperationException();}
	public SiteMarketingDataExtensionMapping clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SiteMarketingDataExtensionMapping clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SiteMarketingDataExtensionMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SiteMarketingDataExtensionMapping clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
