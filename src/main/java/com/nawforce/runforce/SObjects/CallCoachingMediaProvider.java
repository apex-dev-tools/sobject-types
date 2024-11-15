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
public class CallCoachingMediaProvider extends SObject {
	public static SObjectType$<CallCoachingMediaProvider> SObjectType;
	public static SObjectFields$<CallCoachingMediaProvider> Fields;

	public Id ConversationVendorInfoId;
	public ConversationVendorInfo ConversationVendorInfo;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String ProviderDescription;
	public String ProviderName;
	public Datetime SystemModstamp;

	public CallCoachingMediaProvider clone$() {throw new java.lang.UnsupportedOperationException();}
	public CallCoachingMediaProvider clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachingMediaProvider clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachingMediaProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CallCoachingMediaProvider clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
