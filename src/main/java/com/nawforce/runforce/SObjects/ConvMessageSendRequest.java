/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConvMessageSendRequest extends SObject {
	public static SObjectType$<ConvMessageSendRequest> SObjectType;
	public static SObjectFields$<ConvMessageSendRequest> Fields;

	public String AllowExistingSessionStatus;
	public Id CommSubscriptionId;
	public CommSubscription CommSubscription;
	public Datetime CompletedDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer FailedMessageCount;
	public String FailedMessageErrorReasons;
	public String FailedMessageIdentifiers;
	public String FailedMeuPlatformKeys;
	public Id Id;
	public Integer InProgressMessageCount;
	public String InProgressMessageIdentifiers;
	public String InProgressMessagingEndUserIds;
	public String InProgressMessagingSessionIds;
	public String InProgressMeuPlatformKeys;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MessageDefinition;
	public String MessageDefinitionParameters;
	public String Name;
	public Integer PendingMessageCount;
	public String PendingMessageIdentifiers;
	public String PendingMessagingEndUserIds;
	public String PendingMeuPlatformKeys;
	public String RequestConsentType;
	public String RequestStatus;
	public String RequestType;
	public String SessionLongevityPreference;
	public Boolean ShouldEnforceChannelConsent;
	public Integer SuccessMessageCount;
	public String SuccessMessageIdentifiers;
	public String SuccessMeuPlatformKeys;
	public Datetime SystemModstamp;
	public Integer TotalMessageCount;

	public ConvMessageSendRequest clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConvMessageSendRequest clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConvMessageSendRequest clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConvMessageSendRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConvMessageSendRequest clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
