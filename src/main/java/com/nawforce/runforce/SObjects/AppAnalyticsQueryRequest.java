/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
