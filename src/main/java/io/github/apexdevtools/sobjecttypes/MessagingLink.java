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
public class MessagingLink extends SObject {
	public static SObjectType$<MessagingLink> SObjectType;
	public static SObjectFields$<MessagingLink> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EntityType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id RecordTypeId;
	public RecordType RecordType;
	public Boolean ShouldAttemptAutoLink;
	public Boolean ShouldPromptCreate;
	public Datetime SystemModstamp;

	public MessagingLink clone$() {throw new java.lang.UnsupportedOperationException();}
	public MessagingLink clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MessagingLink clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MessagingLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MessagingLink clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
