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
public class ReplyEmailSettings extends SObject {
	public static SObjectType$<ReplyEmailSettings> SObjectType;
	public static SObjectFields$<ReplyEmailSettings> Fields;

	public String AutoReplyMessage;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String DomainName;
	public String FwdEmailAddress;
	public Id Id;
	public Boolean IsAutoReplyEnabled;
	public Boolean IsDeleteAutoRepliesEnabled;
	public Boolean IsDeleted;
	public Boolean IsEmailForwardingEnabled;
	public Boolean IsUnsubscribeManualRequestsEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Datetime SystemModstamp;
	public String UnsubscribeTerms;

	public ReplyEmailSettings clone$() {throw new java.lang.UnsupportedOperationException();}
	public ReplyEmailSettings clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ReplyEmailSettings clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ReplyEmailSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ReplyEmailSettings clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
