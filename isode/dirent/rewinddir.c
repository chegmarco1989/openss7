/*****************************************************************************

 @(#) $RCSfile$ $Name$($Revision$) $Date$

 -----------------------------------------------------------------------------

 Copyright (c) 2001-2007  OpenSS7 Corporation <http://www.openss7.com/>
 Copyright (c) 1997-2000  Brian F. G. Bidulock <bidulock@openss7.org>

 All Rights Reserved.

 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU General Public License as published by the Free Software
 Foundation, version 3 of the license.

 This program is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details.

 You should have received a copy of the GNU General Public License along with
 this program.  If not, see <http://www.gnu.org/licenses/>, or write to the
 Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.

 -----------------------------------------------------------------------------

 U.S. GOVERNMENT RESTRICTED RIGHTS.  If you are licensing this Software on
 behalf of the U.S. Government ("Government"), the following provisions apply
 to you.  If the Software is supplied by the Department of Defense ("DoD"), it
 is classified as "Commercial Computer Software" under paragraph 252.227-7014
 of the DoD Supplement to the Federal Acquisition Regulations ("DFARS") (or any
 successor regulations) and the Government is acquiring only the license rights
 granted herein (the license rights customarily provided to non-Government
 users).  If the Software is supplied to any unit or agency of the Government
 other than DoD, it is classified as "Restricted Computer Software" and the
 Government's rights in the Software are defined in paragraph 52.227-19 of the
 Federal Acquisition Regulations ("FAR") (or any successor regulations) or, in
 the cases of NASA, in paragraph 18.52.227-86 of the NASA Supplement to the FAR
 (or any successor regulations).

 -----------------------------------------------------------------------------

 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See http://www.openss7.com/

 -----------------------------------------------------------------------------

 Last Modified $Date$ by $Author$

 -----------------------------------------------------------------------------

 $Log$
 *****************************************************************************/

#ident "@(#) $RCSfile$ $Name$($Revision$) $Date$"

static char const ident[] = "$RCSfile$ $Name$($Revision$) $Date$";

#ifndef HAVE_REWINDDIR

/*
	rewinddir -- rewind a directory stream

	last edit:	25-Apr-1987	D A Gwyn

	This is not simply a call to seekdir(), because seekdir()
	will use the current buffer whenever possible and we need
	rewinddir() to forget about buffered data.
*/

#include	<sys/errno.h>
#include	<sys/types.h>
#include	"usr.dirent.h"

#ifndef	GETDENTS
extern off_t lseek();

extern int errno;

#ifndef NULL
#define	NULL	0
#endif

#ifndef SEEK_SET
#define	SEEK_SET	0
#endif

void
rewinddir(dirp)
	register DIR *dirp;		/* stream from opendir() */
{
	if (dirp == NULL || dirp->dd_buf == NULL) {
		errno = EFAULT;
		return;		/* invalid pointer */
	}

	dirp->dd_loc = dirp->dd_size = 0;	/* invalidate buffer */
	(void) lseek(dirp->dd_fd, (off_t) 0, SEEK_SET);	/* may set errno */
}
#else
int
_rewinddir_stub()
{;
}
#endif
#endif				/* HAVE_REWINDDIR */