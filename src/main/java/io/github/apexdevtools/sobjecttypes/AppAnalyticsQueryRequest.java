/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AppAnalyticsQueryRequest extends SObject {
	public static SObjectType$<AppAnalyticsQueryRequest> SObjectType;
	public static SObjectFields$<AppAnalyticsQueryRequest> Fields;

	public Datetime AvailableSince;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public Datetime DownloadExpirationTime;
	public Long DownloadSize;
	public String DownloadUrl;
	public Datetime EndTime;
	public String ErrorMessage;
	public String FileCompression;
	public String FileType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String OrganizationIds;
	public String PackageIds;
	public Datetime QuerySubmittedTime;
	public String RequestState;
	public Datetime StartTime;
	public Datetime SystemModstamp;

	public AppAnalyticsQueryRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppAnalyticsQueryRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppAnalyticsQueryRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppAnalyticsQueryRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppAnalyticsQueryRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
