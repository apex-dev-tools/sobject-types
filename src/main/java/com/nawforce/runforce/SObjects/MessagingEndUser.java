/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class MessagingEndUser extends SObject {
	public static SObjectType$<MessagingEndUser> SObjectType;
	public static SObjectFields$<MessagingEndUser> Fields;

	public Id AccountId;
	public Account Account;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Boolean HasInitialResponseSent;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsFullyOptedIn;
	public String IsoCountryCode;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Id LeadId;
	public Lead Lead;
	public String Locale;
	public String MessageType;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public String MessagingConsentStatus;
	public String MessagingPlatformKey;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public String ProfilePictureUrl;
	public Datetime SystemModstamp;

	public ConversationEntry[] ConversationEntries;
	public ConversationParticipant[] ConversationParticipants;
	public MessagingEndUserHistory[] Histories;
	public MessagingSession[] MessagingSessions;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MessagingEndUserShare[] Shares;

	public MessagingEndUser clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUser clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUser clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUser clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
