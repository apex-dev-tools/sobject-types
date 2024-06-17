/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class VideoVendorAdminConsent extends SObject {
	public static SObjectType$<VideoVendorAdminConsent> SObjectType;
	public static SObjectFields$<VideoVendorAdminConsent> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExternalStoreKey;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Status;
	public Datetime SystemModstamp;
	public String VendorRegionKey;

	public VideoVendorAdminConsent clone$() {throw new java.lang.UnsupportedOperationException();}
	public VideoVendorAdminConsent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public VideoVendorAdminConsent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public VideoVendorAdminConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public VideoVendorAdminConsent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
