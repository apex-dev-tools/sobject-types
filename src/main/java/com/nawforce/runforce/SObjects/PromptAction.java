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
public class PromptAction extends SObject {
	public static SObjectType$<PromptAction> SObjectType;
	public static SObjectFields$<PromptAction> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public com.nawforce.runforce.System.String CurrencyIsoCode;
	public Id Id;
	public com.nawforce.runforce.System.Boolean IsDeleted;
	public Datetime LastDisplayDate;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public com.nawforce.runforce.System.String LastResult;
	public Datetime LastResultDate;
	public com.nawforce.runforce.System.String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PromptVersionId;
	public PromptVersion PromptVersion;
	public Datetime SnoozeUntil;
	public com.nawforce.runforce.System.Integer StepCount;
	public com.nawforce.runforce.System.Integer StepNumber;
	public Datetime SystemModstamp;
	public com.nawforce.runforce.System.Integer TimesActionTaken;
	public com.nawforce.runforce.System.Integer TimesDismissed;
	public com.nawforce.runforce.System.Integer TimesDisplayed;
	public com.nawforce.runforce.System.Integer TimesSnoozed;
	public Id UserId;
	public User User;

	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public PromptActionShare[] Shares;

	public PromptAction clone$() {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(com.nawforce.runforce.System.Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PromptAction clone$(com.nawforce.runforce.System.Boolean preserveId, com.nawforce.runforce.System.Boolean isDeepClone, com.nawforce.runforce.System.Boolean preserveReadonlyTimestamps, com.nawforce.runforce.System.Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
