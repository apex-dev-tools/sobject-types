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
public class MsgChannelLanguageKeyword extends SObject {
	public static SObjectType$<MsgChannelLanguageKeyword> SObjectType;
	public static SObjectFields$<MsgChannelLanguageKeyword> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomKeywords;
	public String CustomResponse;
	public String DoubleOptInKeywords;
	public String HelpKeywords;
	public String HelpResponse;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLanguage;
	public Id MessagingChannelId;
	public MessagingChannel MessagingChannel;
	public Id MessagingChannelUsageId;
	public MessagingChannelUsage MessagingChannelUsage;
	public String OptInConfirmation;
	public String OptInKeywords;
	public String OptOutConfirmation;
	public String OptOutKeywords;
	public Datetime SystemModstamp;

	public MsgChannelLanguageKeyword clone$() {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelLanguageKeyword clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelLanguageKeyword clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelLanguageKeyword clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public MsgChannelLanguageKeyword clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
