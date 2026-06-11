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
public class MessagingDeliveryError extends SObject {
	public static SObjectType$<MessagingDeliveryError> SObjectType;
	public static SObjectFields$<MessagingDeliveryError> Fields;

	public String CorrelationIdentifier;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DestinationPhoneNumber;
	public String FailureReason;
	public String FlowEntity;
	public String FullMessage;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id MessagingEndUserId;
	public MessagingEndUser MessagingEndUser;
	public Id MessagingTemplateId;
	public MessagingTemplate MessagingTemplate;
	public String Name;
	public Datetime SystemModstamp;
	public String Type;

	public MessagingDeliveryError clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingDeliveryError clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingDeliveryError clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingDeliveryError clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingDeliveryError clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
