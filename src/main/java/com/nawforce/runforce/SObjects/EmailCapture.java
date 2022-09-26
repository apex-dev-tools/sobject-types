/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailCapture extends SObject {
	public static SObjectType$<EmailCapture> SObjectType;
	public static SObjectFields$<EmailCapture> Fields;

	public Datetime CaptureDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String FromPattern;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Blob RawMessage;
	public Integer RawMessageLength;
	public String Recipient;
	public String Sender;
	public Datetime SystemModstamp;
	public String ToPattern;

	public EmailCapture clone$() {throw new java.lang.UnsupportedOperationException();}
	public EmailCapture clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EmailCapture clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EmailCapture clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EmailCapture clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
