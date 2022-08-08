/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class BusProcessFeedbackConfig extends SObject {
	public static SObjectType$<BusProcessFeedbackConfig> SObjectType;
	public static SObjectFields$<BusProcessFeedbackConfig> Fields;

	public com.nawforce.runforce.System.String ActionName;
	public com.nawforce.runforce.System.String ActionType;
	public com.nawforce.runforce.System.String ConfigurationDescription;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String DeveloperName;
	public com.nawforce.runforce.System.String Field;
	public com.nawforce.runforce.System.String FieldValue;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsActive;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public com.nawforce.runforce.System.String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String MasterLabel;
	public com.nawforce.runforce.System.String NamespacePrefix;
	public com.nawforce.runforce.System.String Object;
	public com.nawforce.runforce.System.String Recipient;
	public com.nawforce.runforce.System.String RecordType;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.String TriggerAction;

	public BusProcessFeedbackConfig clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusProcessFeedbackConfig clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
