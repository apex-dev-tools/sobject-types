/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class MessagingEndUserChangeEvent extends SObject {
	public static SObjectType$<MessagingEndUserChangeEvent> SObjectType;
	public static SObjectFields$<MessagingEndUserChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AuthenticatedEndUserId;
	public User AuthenticatedEndUser;
	public Object ChangeEventHeader;
	public Id ContactId;
	public Contact Contact;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Boolean HasInitialResponseSent;
	public Id Id;
	public Boolean IsFullyOptedIn;
	public String IsoCountryCode;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LeadId;
	public Lead Lead;
	public String Locale;
	public String MessageType;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public String MessagingConsentStatus;
	public String MessagingExternalUserKey;
	public String MessagingPlatformKey;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ProfilePictureUrl;
	public String ReplayId;

	public MessagingEndUserChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingEndUserChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
