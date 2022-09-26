/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OutgoingEmail extends SObject {
	public static SObjectType$<OutgoingEmail> SObjectType;
	public static SObjectFields$<OutgoingEmail> Fields;

	public String BccAddress;
	public String CcAddress;
	public Id EmailTemplateId;
	public EmailTemplate EmailTemplate;
	public String ExternalId;
	public String HtmlBody;
	public Id Id;
	public String InReplyTo;
	public String MessageId;
	public String References;
	public Id RelatedToId;
	public Name RelatedTo;
	public String Subject;
	public String TextBody;
	public String ToAddress;
	public String ValidatedFromAddress;
	public Id WhoId;
	public Name Who;
	public String[] ContentDocumentIds;
	public String[] ToIds;
	public String[] CcIds;
	public String[] BccIds;

	public ContentDocumentLink[] ContentDocumentLinks;
	public OutgoingEmailRelation[] OutgoingEmailRelations;

	public OutgoingEmail clone$() {throw new UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public OutgoingEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
