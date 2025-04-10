/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class SiteIframeWhiteListUrl extends SObject {
	public static SObjectType$<SiteIframeWhiteListUrl> SObjectType;
	public static SObjectFields$<SiteIframeWhiteListUrl> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id SiteId;
	public Site Site;
	public Datetime SystemModstamp;
	public String Url;

	public SiteIframeWhiteListUrl clone$() {throw new java.lang.UnsupportedOperationException();}
	public SiteIframeWhiteListUrl clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SiteIframeWhiteListUrl clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SiteIframeWhiteListUrl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SiteIframeWhiteListUrl clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
