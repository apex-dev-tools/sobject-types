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
public class LiveChatSensitiveDataRule extends SObject {
	public static SObjectType$<LiveChatSensitiveDataRule> SObjectType;
	public static SObjectFields$<LiveChatSensitiveDataRule> Fields;

	public String ActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Integer EnforceOn;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsEnabled;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String Pattern;
	public Integer Priority;
	public String ProcessingType;
	public String Replacement;
	public Datetime SystemModstamp;
	public String Version;

	public LiveChatSensitiveDataRule clone$() {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LiveChatSensitiveDataRule clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
