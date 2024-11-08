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
public class ContactCenterChannel extends SObject {
	public static SObjectType$<ContactCenterChannel> SObjectType;
	public static SObjectFields$<ContactCenterChannel> Fields;

	public Id ChannelId;
	public MessagingChannel Channel;
	public Id ContactCenterId;
	public CallCenter ContactCenter;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime SystemModstamp;
	public Id VoicemailFallbackQueueId;
	public Group VoicemailFallbackQueue;
	public String VoicemailHandler;

	public ContactCenterChannel clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactCenterChannel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactCenterChannel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactCenterChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactCenterChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
