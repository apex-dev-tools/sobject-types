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
public class MessagingChannel extends SObject {
	public static SObjectType$<MessagingChannel> SObjectType;
	public static SObjectFields$<MessagingChannel> Fields;

	public Id BusinessHoursId;
	public BusinessHours BusinessHours;
	public String ChannelAddressIdentifier;
	public Id ChannelDefinitionId;
	public ConversationChannelDefinition ChannelDefinition;
	public String ConsentType;
	public String ConversationEndResponse;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public String DoubleOptInPrompt;
	public String EngagedResponse;
	public Id FallbackQueueId;
	public Group FallbackQueue;
	public Id Id;
	public String InitialResponse;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsLinkedRecordOpenedAsSubTab;
	public Boolean IsRequireDoubleOptIn;
	public Boolean IsRestrictedToBusinessHours;
	public String IsoCountryCode;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String LinkingPreference;
	public String MasterLabel;
	public String MessageType;
	public String MessagingPlatformKey;
	public String OfflineAgentsResponse;
	public String OptInPrompt;
	public String OutsideBusinessHoursResponse;
	public String PlatformType;
	public String RoutingType;
	public Id SessionHandlerId;
	public Name SessionHandler;
	public Datetime SystemModstamp;
	public Id TargetQueueId;
	public Group TargetQueue;

	public ContactCenterChannel[] ContactCenterChannels;
	public CommSubscriptionChannelType[] MessagingChannels;
	public MessagingLink[] MessagingLinks;
	public MsgChannelAvailability[] MsgChannelAvailabilities;
	public MsgChannelLanguageKeyword[] MsgChannelLanguageKeywords;
	public SetupEntityAccess[] SetupEntityAccessItems;

	public MessagingChannel clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
