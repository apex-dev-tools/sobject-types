/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MessagingSessionChangeEvent extends SObject {
	public static SObjectType$<MessagingSessionChangeEvent> SObjectType;
	public static SObjectFields$<MessagingSessionChangeEvent> Fields;

	public Datetime AcceptTime;
	public Integer AgentMessageCount;
	public String AgentType;
	public Id CaseId;
	public Case Case;
	public Object ChangeEventHeader;
	public String ChannelEndUserFormula;
	public String ChannelGroup;
	public String ChannelIntent;
	public String ChannelKey;
	public String ChannelLocale;
	public String ChannelName;
	public String ChannelType;
	public Id ConversationId;
	public Conversation Conversation;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Datetime EndTime;
	public Id EndUserAccountId;
	public Account EndUserAccount;
	public Id EndUserContactId;
	public Contact EndUserContact;
	public String EndUserLanguage;
	public Integer EndUserMessageCount;
	public String EndedByType;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id MessagingEndUserId;
	public MessagingEndUser MessagingEndUser;
	public String Name;
	public Id OpportunityId;
	public Opportunity Opportunity;
	public String Origin;
	public Id OwnerId;
	public User Owner;
	public String PreviewDetails;
	public String ReplayId;
	public String SessionKey;
	public Datetime StartTime;
	public String Status;
	public String SuspendedByType;
	public Id TargetUserId;
	public User TargetUser;

	public MessagingSessionChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingSessionChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
