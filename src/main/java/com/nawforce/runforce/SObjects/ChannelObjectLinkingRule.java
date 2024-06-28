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
public class ChannelObjectLinkingRule extends SObject {
	public static SObjectType$<ChannelObjectLinkingRule> SObjectType;
	public static SObjectFields$<ChannelObjectLinkingRule> Fields;

	public String ActionForNoRecordFound;
	public String ActionForSingleRecordFound;
	public String ChannelType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsLinkedRecordOpenedAsSubTab;
	public Boolean IsRuleActive;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ObjectToLink;
	public String RuleName;
	public Datetime SystemModstamp;

	public ChannelObjectLinkingRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChannelObjectLinkingRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChannelObjectLinkingRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChannelObjectLinkingRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChannelObjectLinkingRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
